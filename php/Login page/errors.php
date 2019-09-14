<?php
if(count($errors)>0):
 ?>
 <div >
   <p style="color:white;background:red;border-radius:15px;padding:10px 10px;margin:0;margin-bottom:5px;"> <?php echo "regpage-errors" ?></p>
   <p style="color:white;background:red;border-radius:15px;padding:10px 10px;margin:0;margin-bottom:5px;"> <?php echo "--------------------------------" ?></p>
   <?php foreach ($errors as $key): ?>
     <p style="color:white;background:red;border-radius:15px;padding:10px 10px;margin:0;margin-bottom:5px;"><?php echo $key ?></p>
   <?php endforeach ?>
 </div>
 <?php endif ?>
 <?php
 if(count($login_errors)>0):
  ?>
  <div >
 <p style="color:white;background:red;border-radius:15px;padding:10px 10px;margin:0;margin-bottom:5px;"> <?php echo "loginpageerrors" ?></p>
 <p style="color:white;background:red;border-radius:15px;padding:10px 10px;margin:0;margin-bottom:5px;"> <?php echo "--------------------------------" ?></p>
  <?php foreach ($login_errors as $key): ?>
    <p style="color:white;background:red;border-radius:15px;padding:10px 10px;margin:0;margin-bottom:5px;"><?php echo $key ?></p>
  <?php endforeach ?>


<?php endif ?>
