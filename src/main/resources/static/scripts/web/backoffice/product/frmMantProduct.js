$(document).on("click", "#btnagregar", function(){
    $("#txtnombreproducto").val("");
    $("#txtpreciounit").val("");
    $("#hddcodprod").val("0");
    $("#cbocategoria").empty();
    $("#cboproveedor").empty();
    $("#switchproducto").hide();//esconder
    $("#chkdescontinuado").prop("checked", false);
    $("#modalNuevo").modal("show");
});

$(document).on("click", ".btnactualizar", function(){
    $("#txtnombreproducto").val($(this).attr("data-prodname"));
    $("#txtpreciounit").val($(this).attr("data-produnit"));
    $("#hddcodprod").val($(this).attr("data-prodcod"));
    $("#cbocategoria").empty();
    $("#cboproveedor").empty();
    listarCategoriasProvedores($(this).attr("data-prodcateg"), $(this).attr("data-prodprov"));
    listarCategoriasProvedores($(this).attr("data-prodcod"));
    $("#switchproducto").show();//esconder
    if($(this).attr("data-descontinuado") === "true")
        $("#chkdescontinuado").prop("checked", true);
    else
        $("#chkdescontinuado").prop("checked", false);
    $("#modalNuevo").modal("show");
});

function listarCategoriasProvedores(idcate, idprov){
    $.ajax({
        type: "GET",
        url: "/backoffice/category/listar",
        datatype: "json",
        success: function(resultado){
            $.each(resultado, function(index, value){
                $("#cbocategoria").append(
                `<option value="${value.categoryid}">${value.categoryname}</option>`
                )
            })
            if(idcate > 0) {
                $("#cbocategoria").val(idcate);
            }
            $.ajax({
                    type: "GET",
                    url: "/backoffice/supplier/listar",
                    datatype: "json",
                    success: function(resultado){
                        $.each(resultado, function(index, value){
                            $("#cboproveedor").append(
                            `<option value="${value.supplierid}">${value.companyname}</option>`
                            )
                        })
                        if(idprov > 0) {
                            $("#cboproveedor").val(idprov);
                        }
                    }
                })
        }
    })
}