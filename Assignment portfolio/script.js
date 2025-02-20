
        // JavaScript to handle fade-up animation on scroll
        const fadeElements = document.querySelectorAll(".fade-up");

        const observer = new IntersectionObserver(entries => {
            entries.forEach(entry => {
                if (entry.isIntersecting) {
                    entry.target.classList.add("active");
                }
            });
        }, { threshold: 0.2 });

        fadeElements.forEach(el => observer.observe(el));
