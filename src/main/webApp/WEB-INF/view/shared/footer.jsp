<!-- Bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<script>
const toggleLeftNav = () => {
	const openLeftNavBtn = document.getElementById("toggle_laft_nav");
	const closeLeftNavBtn = document.getElementById("toggle_laft_nav_close");
	const leftNav = document.getElementById("left_nav");
	
	
	leftNav.classList.toggle("visible");
		
	if (leftNav.classList.contains("visible")) {
		openLeftNavBtn.style.display = "none";
		closeLeftNavBtn.style.display = "grid";
	} else {
		openLeftNavBtn.style.display = "grid";
		closeLeftNavBtn.style.display = "none";
	}
}
</script>
</body>
</html>