package br.com.juliorgm.livrosandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.juliorgm.livrosandroid.helper.LivroHelper;
import br.com.juliorgm.livrosandroid.model.Livro;

public class FormLivrosActivity extends AppCompatActivity {
    Livro livro;
    LivroHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_livros);

        Intent intent = getIntent();
        livro = (Livro)intent.getSerializableExtra("LIVRO");

        helper = new LivroHelper(this,livro);
    }

    public void excluiLivro(View view){
        livro = Livro.findById(Livro.class,livro.getId());
        livro.delete();
        finish();
    }

    public void salvarLivro(View view){
        livro = helper.pegaLivro();
        livro.save();
        finish();
    }
}
