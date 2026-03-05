
<script>
var dataAlvo = new Date("Mar 09, 2025 00:00:00").getTime();

var x = setInterval(function() {

  var agora = new Date().getTime();
  var distancia = dataAlvo - agora;

  var dias = Math.floor(distancia / (1000 * 60 * 60 * 24));
  var horas = Math.floor((distancia % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
  var minutos = Math.floor((distancia % (1000 * 60 * 60)) / (1000 * 60));
  var segundos = Math.floor((distancia % (1000 * 60)) / 1000);

  document.getElementById("countdown").innerHTML =
  dias + "d " + horas + "h "
  + minutos + "m " + segundos + "s ";

  if (distancia < 0) {
    clearInterval(x);
    document.getElementById("countdown").innerHTML =
    "Feliz 1 ano de namoro ❤️";
  }

}, 1000);
</script>