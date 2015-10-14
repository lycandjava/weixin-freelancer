function initFzpfz() {
	var func = (function(data) {
		$("#select_year").append(data);
		onYearChange();
	});  
	ajaxSubmitCallback(new Object(), "Gjsj!yearList.action", func);
}

function onYearChange() {
	var year = $("#select_year").val();
	var param = new Object();
	param["year"] = year;
	ajaxSubmit(param, "Gjsj!list.action", "gjtjcl_widget");
}