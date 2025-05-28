package LinkedList;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class MyLinkedListOG {

    int count = 0;
    
    class Container {
        String content;
        Container next;
    }
    
    public MyLinkedListOG() {


    }

    public int size() {
        // liefert die Anzahl der Elemente
        return count;
    }

    public boolean isEmpty() {
        // sagt ob die Liste leer ist
        if (count == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(String s) {
        // liefert true wenn s enthalten ist


    }

    public boolean add(String s) {
        // hängt den String s ans Ende
        // liefert true, wenn es geklappt hat (also immer!)
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean remove(String s) {
        // löscht das erste Vorkommen von s, die folgenden Elemente rücken vor
        // liefert false, wenn s nicht enthalten ist
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void clear() {
        // Leert den Container
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String get(int i) {
        // holt das Element an der Stelle i (ohne es zu löschen)
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String set(int i, String e) {
        // ersetzt das Element an der Stelle i
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(int i, String s) {
        // fügt s an der Stelle i ein (nachfolgende Elemente rutschen weiter)
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // löscht das Element an der Stelle i, die folgenden Elemente rücken vor
    // liefert das gelöschte Element als Ergebnis
    public String remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int indexOf(String s) {
        // liefert die Platznummer des ersten Vorkommens von s
        // oder -1 wenn s nicht enthalten ist
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int lastIndexOf(Object o) {
        // liefert die Platznummer des letzten Vorkommens von s
        // oder -1 wenn s nicht enthalten ist
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
