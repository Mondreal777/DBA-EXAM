<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exam 1</title>
</head>
<body>
<?php  
    //Initialize array   
    $arr = array(5, 1, 4, 6, 7, 3, 5, 7, 3);   
    
    print("Duplicate elements in given array: <br>");  
    //Searches for duplicate element  
    for($i = 0; $i < count($arr); $i++) {  
        for($j = $i + 1; $j < count($arr); $j++) {  
            if($arr[$i] == $arr[$j])  
                print($arr[$j] . "<br>");  
        }  
    }  
?>  
</body>
</html>