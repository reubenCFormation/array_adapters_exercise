package com.uniquename.arrayadaptersexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
  Button mSeeFamousBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /*
      Enonce. Creer Deux Activités differentes, FamousPeopleActivity et FamousPlacesActivity. Dans ces deux activités, nous allons afficher une liste partielle de nos tableaux. Si nous sommes sur l'activité FamousPeopleActivity nous allons afficher une liste partielle de notre tableaux famousPeople (avec un ArrayAdapter). Si nous sommes sur l'activité FamousPlacesActivity, nous allons  afficher une partielle de notre tableaux famousPLaces (avec un ArrayAdapter). La partialité du tableaux sera determiné par un numero aleatoire entre 0 et le nombre d'elements se trouvant dans le tableau visé. Hint. Il va falloir preciser DEUX putExtra dans vos Intents. Autre HINT. Servez vous de la methode copyOfRange. Elle s'ecrit Arrays.copyOfRange(myArray,min,max)

     */

    public String[] getFamousPeople(){
        String[] famousPeople={"Micheal Jackson","Micheal Jordan","Francois Hollande","Bill Crosby","Barry Bonds","Tom Brady","Eli Manning","Taylor Swift","Travis Kelce","Patrick Mahomes","Killian Mbappe"};

        return famousPeople;
    }

    public String[] getFamousPlaces(){
        String[] famousPlaces={"Disney World","Disney Land","Times Square","The Dead Sea","Golden Gate Bridge","La TOur Eiffiel","The Vatican","Death Valley","Mt Everest"};
        return famousPlaces;
    }







}