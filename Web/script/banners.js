document.getElementById('openButton').addEventListener('click', function() {
    const button = this;
    button.disabled = true;
    button.textContent = 'Abriendo...';

    const lid = document.querySelector('.lid');
    const rewardImg = document.getElementById('reward');
    const rewards = [
        { src: 'img/Blastoisita.png', alt: 'Blastoisita' },
        { src: 'img/Charizardita.png', alt: 'Charizardita' },
        { src: 'img/Venusarita.png', alt: 'Venusarita' }
    ];

    const winnerIndex = Math.floor(Math.random() * 3);
    const winner = rewards[winnerIndex];

    rewardImg.src = winner.src;
    rewardImg.alt = winner.alt;

    lid.classList.add('open');

    setTimeout(() => {
        rewardImg.classList.add('show');

        document.getElementById('result').textContent = `¡Felicidades! Has obtenido: ${winner.alt} (x1)`;

        setTimeout(() => {
            lid.classList.remove('open');
            rewardImg.classList.remove('show');
            rewardImg.src = '';
            rewardImg.alt = '';
            document.getElementById('result').textContent = '';
            button.disabled = false;
            button.textContent = 'Abrir Regalo';
        }, 3000);
    }, 2000);
});