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

    if (count == myArray.length) {
      String[] newArray = new String[myArray.length + 5];

      for (int i = 0; i < myArray.length; i++) {
        newArray[i] = myArray[i];
      }

      myArray = newArray;
    }

    myArray[count] = s;
    count++;
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
    myArray[i] = e;

    return myArray[i];

  }

  public void add(int i, String s) {
    // fügt s an der Stelle i ein (nachfolgende Elemente rutschen weiter)

    //neues Array mit mehr Platz
    String[] newArray = new String[myArray.length + 1];

    //iteriert durch das alte Array
    for (int j = 0; j < i; j++) {
      newArray[j] = myArray[j];
    }
    newArray[i] = s;

    for (int j = i; j< myArray.length; j++) {
      newArray[j+1] = myArray[j];
    }
    myArray = newArray;
  }


  public String remove(int i) {
    // löscht das Element an der Stelle i, die folgenden Elemente rücken vor
    // liefert das gelöschte Element als Ergebnis

    String[] newArray = new String[myArray.length - 1];
    String remove = myArray[i];

    for (int j = 0; j < i; j++) {
      newArray[j] = myArray[j];
    }

    for (int j = i + 1; j< myArray.length; j++) {
      newArray[j-1] = myArray[j];
    }
    myArray = newArray;

    return remove;


  }

  public int indexOf(String s) {
    // liefert die Platznummer des ersten Vorkommens von s
    // oder -1 wenn s nicht enthalten ist

    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] == s) {
        return i;
      }
    }
    return -1;

  }

  public int lastIndexOf(Object o) {
    // liefert die Platznummer des letzten Vorkommens von o
    // oder -1 wenn o nicht enthalten ist
    int count = -1;

    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] == o || (myArray[i] != null && myArray[i].equals(o))) {
        count = i;
      }
    }

    return count;
  }
}
