// Peanut Butter and Nutella - Prattay Dey + Winnie, Brian Li + Robert, Nafiz Labib + Martha
// APCS pd6
// HW45 -- interfaces
// 2021-12-09
// time spent: 0.5 hours

/*
DISCO
- Interfaces basically work as "checklists", making sure a class has certain methods or instance variables before being allowed to compile and run.
- Abstract objects cannot be instantiated.
QCC
- What is the point of interfaces? Can't you use inheritance as a way to make sure certain methods/variables exist?
*/

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 ***************************/

public class SuperArray implements ListInt
{

  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    if (index + 1 > _size){
      _size = index + 1;
    }
    return temp;
  }


  //adds an item after the last item
  public void add( int newVal )
  {
    if (_size >= _data.length - 1){ // checks if the size of the array is approaching its actual limit
      expand(); // if so, expand!
    }
    _data[_size] = newVal;
    _size += 1;
  }


  //inserts an item at index
  public void add( int index, int newVal )
  {
    if (index > _size){
      System.out.println("Specified index is out of range.");
    }
    else{
      int[] temp = _data;
      _data = new int[_size + 2]; // +1 because _size starts at 0, +1 again because we are allocating space for one more index
      for (int i = 0; i < index; i++){ // populates array until it reaches desired index
        _data[i] = temp[i];
      }
      _data[index] = newVal; // adds new value at index
      _size += 1; // increases _size by 1 due to adding new value
      for (int i = index; i < _size; i++){ // shifts succeeding index values one right
        _data[i + 1] = temp[i];
      }
    }
  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index )
  {
    int[] temp = _data;
    _data = new int[_size]; // +1 because _size starts at 0, -1 because we are removing one index
    for (int i = 0; i < index; i++){ // populates array until it reaches desired index
      set(i, temp[i]);
    }
    _size -= 1; // reduces _size by 1 due to removing new value
    for (int i = index; i < _size; i++){ // shifts succeeding index values one left
      set(i, temp[i + 1]);
    }
  }


  //return number of meaningful items in _data
  public int size()
  {
    return _size;
  }



  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      System.out.println("new length of underlying array: "
      + curtis._data.length );
      }

      SuperArray mayfield = new SuperArray();
      System.out.println("Printing empty SuperArray mayfield...");
      System.out.println(mayfield);

      mayfield.add(5);
      mayfield.add(4);
      mayfield.add(3);
      mayfield.add(2);
      mayfield.add(1);

      System.out.println("Printing populated SuperArray mayfield...");
      System.out.println(mayfield);

      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);

      mayfield.add(3,99);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(2,88);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(1,77);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);

      System.out.println("Testing ListInt...");
      // ListInt randle = new ListInt();
      // error: ListInt is abstract; cannot be instantiated

      ListInt randle = new SuperArray();
      System.out.println(randle);
      randle.add(3);
      randle.add(2);
      randle.add(1);
      System.out.println("Printing populated ListInt randle...");
      System.out.println(randle);

      randle.remove(2);
      System.out.println("Printing ListInt randle post-remove...");
      System.out.println(randle);

      randle.add(1, 30);
      System.out.println("Printing ListInt randle post-insert...");
      System.out.println(randle);

      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
