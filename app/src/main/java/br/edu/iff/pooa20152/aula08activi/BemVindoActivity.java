package br.edu.iff.pooa20152.aula08activi;


import android.os.Bundle;
import android.widget.TextView;


public class BemVindoActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");
        String senha = args.getString("senha");

        TextView text = (TextView) findViewById(R.id.text);
        text.setText(nome + ", seja bem vindo. " + senha);

        // Adiciona o botão "up navigation"
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
/*
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home) {
            // O método finish() vai encerrar essa activity
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
*/
}
