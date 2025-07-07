package com.bj.yorimichi.controller;



import com.bj.yorimichi.mapper.CEcrudMapper;
import com.bj.yorimichi.service.CEcrudService;
import com.bj.yorimichi.vo.CEVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CEcrudC {

    @Autowired
    private CEcrudService crudService;

    @GetMapping("/cecrud")
    public String showCecrudPage() {
        return "jce/cecrud";  // 실제 위치: /WEB-INF/views/jce/cecrud.jsp
    }


    @GetMapping("/destination-all")
    public String ceDestination(Model model) {
    model.addAttribute("destinations", crudService.getAllDestination());
    return "jce/ce_read";
    }

    @GetMapping("/destination-delete")
    public String ceDestinationDelete(@RequestParam("no") int num) {
        crudService.deleteDestination(num);
    return "redirect:/destination-all";
    }

    //바꿀 애들 보여주는 친구
    @GetMapping("/destination-update")
    public String ceDestinationUpdate(@RequestParam("no") int num, Model model) {
        //값을 받고
        //일을 해
        model.addAttribute("destinations", crudService.detailDestination(num));
        //그리고 보내
        return "jce/ce_modi";
    }

    //ㄹㅇ 업데이트 해주는 친구
    @PostMapping("/destination-update")
    public String ceDestinationUpdate(@RequestParam("no") int num, CEVO cevo){
        crudService.modiDestination(cevo);
        return "redirect:/destination-all";
    }

    @PostMapping("/destination-add")
    public String ceDestinationAdd(CEVO cevo) {
        // 값 한번에 받기 => 객체
        crudService.addDestination(cevo);
        return "redirect:/destination-all";
    }

}
