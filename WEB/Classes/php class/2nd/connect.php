<?php

        $host="localhost";
        $username="root";
        $password="";
        $db="dav2025";
        $conn = mysqli_connect($host,$username,$password,$db);
        if(!$conn){
            die("Database is not connected.");
        }
?>