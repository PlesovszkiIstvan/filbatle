/*
* File: MainController.java
* Author: Plesovszki István
* Copyright: 2023, Plesovszki István
* Group: SZOFT II/2/N
* Date: 2023-10-05
* Github: https://github.com/PlesovszkiIstvan
* Licenc: GNU GPL
*/

package controll;

import java.io.FileNotFoundException;

import View.MainConsole;
import modell.Filereader;

public class MainController {
    public MainController() throws FileNotFoundException{
       Filereader fr = new Filereader();
       fr.loadData();
       new MainConsole().showData(fr.getEmplist());
    }
}
