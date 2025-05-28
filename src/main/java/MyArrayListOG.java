/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class MyArrayListOG {

  private String myArray[];
  private int count;

  public MyArrayListOG() {
    myArray = new String[5]; // Erstmal Platz für 5 Elemente
    count = 0;
  }

  public int size() {
    // liefert die Anzahl der Elemente
    return count;
  }

  public boolean isEmpty() {
    // sagt ob der Conatiner leer ist
    if (count == 0) {
      return true;
    }else {
      return false;
    }
  }

  public boolean contains(String s) {

    for (String a : myArray) {
      if (a==null) {
        break;
      }
      if (s.equals(a)) {
        return true;
      }
    }
    return false;
  }

  public boolean add(String s) {
    // hängt den String s ans Ende
    // liefert true, wenn es geklappt hat (also immer!)

    if(count == myArray.length){
      String[] newArray = new String[5 + myArray.length];

      for(int i=0; i<myArray.length; i++ ){
        newArray[i] = myArray[i];
      }

      myArray = newArray;
      myArray[count] = s;
      count ++;

    }else{
      myArray[count] = s;
      count ++;
    }
    return true;
  }

  public boolean remove(String s) {
    // löscht das erste Vorkommen von s, die folgenden Elemente rücken vor
    // liefert false, wenn s nicht enthalten ist
    int targetIndex = -1;
    String[] targetArray;
    boolean check = false;

    //iteriert durch das Array und schaut ob der String enthalten ist
    for (int i = 0; i < count; i++) {

      //findet String
      if (myArray[i].equals(s)) {
        targetIndex = i;
        check = true;
        break;
      }
      //gibt false aus wenn s nicht enthalten ist
      if (i == (count - 1) && check == false) {
        return false;
      }
    }

    //neues array anordnen
    targetArray = new String[myArray.length - 1];
    int j = 0;

    for (int i = 0; i < count; i++) {
      if (i != targetIndex) {
        targetArray[j] = myArray[i];
        j++;
      }
    }
    myArray = targetArray;
    count--;
    return true;
  }

  public void clear() {
    // Leert den Container
    myArray = new String[5];

  }

  public String get(int i) {
    // holt das Element an der Stelle i (ohne es zu löschen)
    return  myArray[i];
  }

  public String set(int i, String e) {
    // ersetzt das Element an der Stelle i
    return myArray[i] = e;

  }

  public void add(int i, String s) {
    // fügt s an der Stelle i ein (nachfolgende Elemente rutschen weiter)
    String[] newArray = new String[myArray.length + 5];

    //iteriert durch das alte Array
    for (int j = 0; j< myArray.length +1; j++) {


    }

  }


  public String remove(int i) {
    // löscht das Element an der Stelle i, die folgenden Elemente rücken vor
    // liefert das gelöschte Element als Ergebnis
    throw new UnsupportedOperationException(
        "Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  public int indexOf(String s) {
    // liefert die Platznummer des ersten Vorkommens von s
    // oder -1 wenn s nicht enthalten ist
    throw new UnsupportedOperationException(
        "Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  public int lastIndexOf(Object o) {
    // liefert die Platznummer des letzten Vorkommens von s
    // oder -1 wenn s nicht enthalten ist
    throw new UnsupportedOperationException(
        "Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
