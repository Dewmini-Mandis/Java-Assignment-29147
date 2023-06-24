<h3>Question</h3>
<h4>Inheritance</h4>

<br>Create a super class called Car. The Car class has the following fields and methods.
<br>◦int speed;
<br>◦double regularPrice;
<br>◦String color;
<br>◦double getSalePrice();

<br><br>Create a sub class of Car class and name it as Truck. The Truck class has the following fields and
methods.
<br>int weight;
<br>◦double getSalePrice();//Ifweight>2000,10%discount.Otherwise,20%discount.
<br><br>Create a subclass of Car class and name it as Ford. The Ford class has the following fields and
methods
<br>◦int year;
<br>◦int manufacturerDiscount;
<br>◦double
<br>getSalePrice();//FromthesalepricecomputedfromCarclass,subtractthemanufacturerD
iscount.
<br><br>Create a subclass of Car class and name it as Sedan. The Sedan class has the following fields and
methods.
<br>◦int length;
<br>◦double getSalePrice();//Iflength>20feet,5%discount,Otherwise,10%discount.
<br><br>Create MyOwnAutoShop class which contains the main() method. Perform the following within
the main() method
<br>Create an instance of Sedan class and initialize all the fields with appropriate values. Use
super(...) method in the constructor for initializing the fields of the superclass.
<br>Create two instances of the Ford class and initialize all the fields with appropriate values. Use
super(...) method in the constructor for initializing the fields of the super class.Create an instance
of Car class and initialize all the fields with appropriate values. Display the sale prices of all
instance.
