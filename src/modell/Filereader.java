/*
* File: Filereader.java
* Author: Plesovszki István
* Copyright: 2023, Plesovszki István
* Group: SZOFT II/2/N
* Date: 2023-10-05
* Github: https://github.com/PlesovszkiIstvan
* Licenc: GNU GPL
*/

package modell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {
    final String FILENAME = "filbt.txt";
        private ArrayList<Employee> emplist = new ArrayList<>();

        public void readFile(){
            try {
                loadData();
            } catch (FileNotFoundException e) {
                System.err.println("Probléma történt a File olvasása során!");
                System.err.println(e.getMessage());
            }
        }

        public ArrayList<Employee> getEmplist() {
            return emplist;
        }

        public void loadData() throws FileNotFoundException {
            File file = new File(FILENAME);
            Scanner sc = new Scanner(file, "utf-8");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] lineArray = line.split(":");
                Employee emp = new Employee();

                emp.setNev(lineArray[0]);
                emp.setTelepules(lineArray[1]);
                emp.setCim(lineArray[2]);
                emp.setSzuletesiDatum(lineArray[3]);
                emp.setFizetes(Integer.parseInt(lineArray[4]));

                this.emplist.add(emp);

            }
            sc.close();
            
        }
}
