<%@ page import="com.example.demowebapp.model.User" %><%--
  Created by IntelliJ IDEA.
  User: st
  Date: 16.07.2024
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <!-- Basic -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <!-- Site Metas -->
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="author" content="" />

    <title>Oxer</title>

    <!-- slider stylesheet -->
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />

    <!-- bootstrap core css -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

    <!-- fonts style -->
    <link href="https://fonts.googleapis.com/css?family=Baloo+Chettan|Dosis:400,600,700|Poppins:400,600,700&display=swap" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet" />
    <!-- responsive style -->
    <link href="css/responsive.css" rel="stylesheet" />
</head>

<body class="sub_page">
<div class="hero_area">
    <!-- header section strats -->
    <header class="header_section">
        <div class="container">
            <div class="header_nav">
                <a class="navbar-brand brand_desktop" href="index.html">
                    <img src="images/logo.png" alt="" />
                </a>
                <div class="main_nav">
                    <div class="top_nav">
                        <ul class=" ">
                            <li class="">
                                <a class="" href="">
                                    <img src="images/telephone.png" alt="" />
                                    <span> +01 1234567890</span>
                                </a>
                            </li>
                            <li class="">
                                <a class="" href="">
                                    <img src="images/mail.png" alt="" />
                                    <span>demo@gmail.com</span>
                                </a>
                            </li>
                            <li class="">
                                <a class="" href="">
                                    <img src="images/location.png" alt="" />
                                    <span>Den mark Loram ipusum</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                    <div class="bottom_nav">
                        <nav class="navbar navbar-expand-lg custom_nav-container">
                            <a class="navbar-brand brand_mobile" href="index.html">
                                <img src="images/logo.png" alt="" />
                            </a>
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                <div class="d-flex ml-auto flex-column flex-lg-row align-items-center">
                                    <ul class="navbar-nav  ">
                                        <li class="nav-item active">
                                            <a class="nav-link" href="index.html">Home <span class="sr-only">(current)</span></a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="about.html"> About </a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="class.html"> Classes </a>
                                        </li>

                                        <!-- Check if user in HHTP Session -->
                                        <%
                                            Object object = session.getAttribute("user");
                                            if (object == null){

                                        %>

                                        <li class="nav-item">
                                            <a class="nav-link" href="login">Login</a>
                                        </li>
                                        <%
                                            } else {
                                                User user = (User) object;
                                        %>
                                        <li class="nav-item">
                                        <h4>Hello, <%=user.getName()%></h4>
                                    </li>

                                        <li class="nav-item">
                                            <a class="nav-link" href="logout">Logout</a>
                                        </li>
                                        <% } %>

                                    </ul>
                                    <form class="form-inline">
                                        <button class="btn ml-3 ml-lg-5 nav_search-btn" type="submit"></button>
                                    </form>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <!-- end header section -->
</div>


<!-- blog section -->

<section class="blog_section layout_padding">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-10 ml-auto">
                <div class="heading_container">
                    <h2>
                        Latest Blog
                    </h2>
                    <p>
                        iusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis n
                    </p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 pl-0">
                <div class="box b1">
                    <div class="img-box">
                        <img src="images/b1.jpg" alt="">
                    </div>
                    <div class="row">
                        <div class="col-lg-8 col-md-10 ml-auto">
                            <div class="detail-box">
                                <div class="img_date">
                                    <h6>
                                        17 <br>
                                        Feb
                                    </h6>
                                </div>
                                <h3>
                                    Boxer Joniya Daro
                                </h3>
                                <p>
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                                </p>
                                <a href="">
                                    Read More
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6 pr-0">
                <div class="box b2">
                    <div class="img-box">
                        <img src="images/b2.jpg" alt="">
                    </div>
                    <div class="row">
                        <div class="col-lg-8 col-md-10 mr-auto">
                            <div class="detail-box">
                                <div class="img_date">
                                    <h6>
                                        17 <br>
                                        Jun
                                    </h6>
                                </div>
                                <h3>
                                    Boxer Joniya Daro
                                </h3>
                                <p>
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                                </p>
                                <a href="">
                                    Read More
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- end blog section -->

<!-- info section -->
<div class="info_section">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-10 ml-auto">
                <div class="row info_main-row">
                    <div class="col-md-6 pr-0">

                        <!-- contact section -->

                        <section class="contact_section">
                            <h2>
                                Request A Call Back
                            </h2>
                            <form action="">
                                <div>
                                    <input type="text" placeholder="Name" />
                                </div>
                                <div>
                                    <input type="text" placeholder="Phone Number" />
                                </div>
                                <div>
                                    <input type="email" placeholder="Email" />
                                </div>
                                <div>
                                    <input type="text" class="message-box" placeholder="Message" />
                                </div>
                                <div class="d-flex ">
                                    <button>
                                        SEND
                                    </button>
                                </div>
                            </form>
                            <div class="map_container">
                                <div class="map">
                                    <div id="googleMap" style="width:100%;height:300px;"></div>
                                </div>
                            </div>
                        </section>

                        <!-- end contact section -->


                        <!-- footer section -->
                        <section class=" footer_section ">
                            <div class="social_box">
                                <a href="#">
                                    <img src="images/facebook.png" alt="">
                                </a>
                                <a href="#">
                                    <img src="images/twitter.png" alt="">
                                </a>
                                <a href="#">
                                    <img src="images/linkedin.png" alt="">
                                </a>
                                <a href="#">
                                    <img src="images/instagram.png" alt="">
                                </a>
                                <a href="#">
                                    <img src="images/youtube.png" alt="">
                                </a>
                            </div>
                            <p>
                                &copy; 2020 All Rights Reserved. Design by
                                <a href="https://html.design/">Free Html Templates</a>
                            </p>
                        </section>
                        <!-- footer section -->

                    </div>
                    <div class="col-md-6  px-0">
                        <div class="img-box">
                            <img src="images/footer-img.jpg" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end info section -->

<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
</script>

<script>
    function openNav() {
        document.getElementById("myNav").classList.toggle("menu_width");
        document.querySelector(".custom_menu-btn").classList.toggle("menu_btn-style");
    }
</script>

<!-- owl carousel script -->
<script type="text/javascript">
    $(".owl-carousel").owlCarousel({
        loop: true,
        margin: 10,
        nav: true,
        navText: [],
        autoplay: true,
        autoplayHoverPause: true,
        responsive: {
            0: {
                items: 1
            },
            600: {
                items: 2
            },
            1000: {
                items: 2
            }
        }
    });


    $(".owl_carousel1").owlCarousel({
        loop: true,
        margin: 25,
        nav: true,
        navText: [],
        autoplay: true,
        autoplayHoverPause: true,
        responsive: {
            0: {
                items: 1
            },
            600: {
                items: 2
            },
            1000: {
                items: 2
            }
        }
    });
</script>
<!-- end owl carousel script -->

<script>
    /** google_map js **/

    function myMap() {
        var mapProp = {
            center: new google.maps.LatLng(40.712775, -74.005973),
            zoom: 18,
        };
        var map = new google.maps.Map(document.getElementById("googleMap"), mapProp);
    }
</script>
<!-- Google Map -->
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap"></script>
<!-- End Google Map -->


</body>

</html>
