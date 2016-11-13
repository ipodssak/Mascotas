package com.udemex.armando.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Contacto> contactos;
    private RecyclerView listadecontactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listadecontactos=(RecyclerView)findViewById(R.id.rvContactos);
        LinearLayoutManager llm= new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listadecontactos.setLayoutManager(llm);
        inicializarlistac();
        inicializarAdaptador();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       if(id==R.id.opcion6){
            Intent i = new Intent(this,losconco.class);
           startActivity(i);
        }

        return super.onOptionsItemSelected(item);

    }


    public void inicializarlistac(){
        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto(R.drawable.mascota3,"Kody","64675464353","PedroFernandez@gmail.com"));
        contactos.add(new Contacto(R.drawable.mascota5,"Pez","7243456754","Armando@gmail.com"));
        contactos.add(new Contacto(R.drawable.mascota2,"Bola de nieve","543232323","AnaKaren@gmail.com"));
        contactos.add(new Contacto(R.drawable.mascotas_6,"los locos ","543232323","AnaKaren@gmail.com"));
        contactos.add(new Contacto(R.drawable.mascota7,"Rapido","7243456754","FernandoParedes@gmail.com"));

        contactos.add(new Contacto(R.drawable.mascota3,"Kody Junior","64675464353","PedroFernandez@gmail.com"));
        contactos.add(new Contacto(R.drawable.mascota5,"Pez Junior","7243456754","Armando@gmail.com"));
        contactos.add(new Contacto(R.drawable.mascota2,"Bola de nieve Junior","543232323","AnaKaren@gmail.com"));
        contactos.add(new Contacto(R.drawable.mascotas_6,"los locos Junior","543232323","AnaKaren@gmail.com"));
        contactos.add(new Contacto(R.drawable.mascota7,"Rapido Junior","7243456754","FernandoParedes@gmail.com"));

    }

    public void inicializarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos,this);
        listadecontactos.setAdapter(adaptador);
    }
}
