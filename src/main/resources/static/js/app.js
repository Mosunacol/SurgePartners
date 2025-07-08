// app.js
document.addEventListener('DOMContentLoaded', function() {
    var myCarousel = new bootstrap.Carousel('#mainCarousel', {
        interval: 4000,
        pause: 'hover',
        keyboard:true,
        wrap: true,
        touch: true // Habilita desplazamiento táctil
    });

    // Opcional: Eventos del carrusel
    myCarousel._element.addEventListener('slid.bs.carousel', function () {
        console.log('Cambió la imagen');
    });
});