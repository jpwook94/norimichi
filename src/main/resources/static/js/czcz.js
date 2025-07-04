const canvas = document.getElementById('cakeCanvas');
const ctx = canvas.getContext('2d');

const candleX = [140, 200, 260];

let sparkles = [];

// 반짝이 입자 만들기
function createSparkles() {
    for (let i = 0; i < 100; i++) {
        sparkles.push({
            x: Math.random() * canvas.width,
            y: Math.random() * canvas.height,
            radius: Math.random() * 2 + 1,
            alpha: Math.random(),
            delta: Math.random() * 0.05
        });
    }
}

function drawSparkles() {
    for (let s of sparkles) {
        ctx.beginPath();
        ctx.arc(s.x, s.y, s.radius, 0, Math.PI * 2);
        ctx.fillStyle = `rgba(255, 255, 200, ${s.alpha})`;
        ctx.fill();

        // 깜빡이기
        s.alpha += s.delta;
        if (s.alpha <= 0 || s.alpha >= 1) {
            s.delta = -s.delta;
        }
    }
}

let flicker = 0;

function drawScene() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);

    // 케이크 바닥
    ctx.fillStyle = '#ff9999';
    ctx.fillRect(100, 200, 200, 100);

    // 케이크 윗단
    ctx.fillStyle = '#ffccff';
    ctx.fillRect(120, 150, 160, 60);

    // 촛불
    candleX.forEach(x => {
        // 초 본체
        ctx.fillStyle = '#66ccff';
        ctx.fillRect(x, 120, 10, 30);

        // 깜빡이는 불빛
        const flameSize = 6 + Math.sin(flicker + x) * 2;

        ctx.save();
        ctx.shadowBlur = 15 + Math.random() * 10;
        ctx.shadowColor = 'orange';

        // 바깥 불꽃
        ctx.beginPath();
        ctx.arc(x + 5, 115, flameSize, 0, Math.PI * 2);
        ctx.fillStyle = 'orange';
        ctx.fill();

        // 안쪽 불꽃
        ctx.shadowBlur = 8;
        ctx.shadowColor = 'yellow';
        ctx.beginPath();
        ctx.arc(x + 5, 115, flameSize / 2, 0, Math.PI * 2);
        ctx.fillStyle = 'yellow';
        ctx.fill();

        ctx.restore();
    });

    // 텍스트
    ctx.font = '24px Arial';
    ctx.fillStyle = '#cc0066';
    ctx.fillText('🎉 생일 축하축하! 🎉', 90, 50);

    // 반짝이
    drawSparkles();

    flicker += 0.1;
    requestAnimationFrame(drawScene);
}

createSparkles();
drawScene();