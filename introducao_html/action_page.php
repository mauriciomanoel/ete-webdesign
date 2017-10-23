<?php
    echo "<pre>";
    echo "REQUEST_METHOD: " . $_SERVER["REQUEST_METHOD"]; 
    echo "<br>";
    if (!empty( $_GET )) {
        var_dump($_GET);
    } else {
        var_dump($_POST);
    }

?>