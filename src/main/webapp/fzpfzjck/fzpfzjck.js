function initFzpfz() {
	var func = (function(data) {
		$("#select_year").append(data);
		onYearChange();
	});  
	ajaxSubmitCallback(new Object(), "Cloth!queryListOfYear.action", func);
}

function onYearChange() {
	var year = $("#select_year").val();
	var param = new Object();
	param["year"] = year;
	ajaxSubmit(param, "Cloth!queryClothFabricImport.action", "fzpjk_widget");
	ajaxSubmit(param, "Cloth!queryClothFabricExport.action", "fzpck_widget");
}