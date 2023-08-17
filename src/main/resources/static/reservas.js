//CREATE AND UPDATE de ;as reservas
const serviceEntity = "clothes";
const idNameToUse = "id_clothes";
let listOfEntities = Reservas;
let defaultEntity = ReservasDefault;

$(document).on("click", "#btnSearch", function () {
    const currentUrl = document.location.href;
    const url = new URL(currentUrl);
    url.searchParams.set("lowerPrice", $('#inputLowerPrice').val());
    url.searchParams.set("higherPrice", $('#inputHigherPrice').val());
    window.location.href = url.href;
})

const currentUrl = document.location.href;
const url = new URL(currentUrl);
$('#inputLowerPrice').val(url.searchParams.get("lowerPrice"));
$('#inputHigherPrice').val(url.searchParams.get("higherPrice"));