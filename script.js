document.querySelector("select[name=movie]").addEventListener("change", function() {
    let selected = this.options[this.selectedIndex];
    document.getElementById("isAdult").value = selected.getAttribute("data-adult");
});
