package com.example.app_busmap;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;

public class CadastroFragment extends Fragment {

    private CadastroViewModel mViewModel;
    private AppCompatEditText edtNome;
    private AppCompatEditText edtEmail;
    private AppCompatEditText edtSenha;
    private AppCompatButton botaoCadastrar;

    public static CadastroFragment newInstance() {
        return new CadastroFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_cadastro, container, false);

        edtNome = view.findViewById(R.id.edit_nome);
        edtEmail = view.findViewById(R.id.edit_email);
        edtSenha = view.findViewById(R.id.edit_senha);
        botaoCadastrar = view.findViewById(R.id.btn_cadastrar);

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Chamar o método inserção
                Usuario usuario = new Usuario(
                        edtNome.getText().toString(),
                        edtEmail.getText().toString(),
                        edtSenha.getText().toString());

                int res = CadastroBanco.inserirCadastro(usuario, getContext());
                if(res<=0){
                    Snackbar.make(botaoCadastrar, "Inserção não realizada!",
                            Snackbar.LENGTH_LONG).show();
                }else{
                    Snackbar.make(view, "Colaborador Inserido com " +
                                    "Sucesso!",
                            Snackbar.LENGTH_LONG).show();
                }
            }
        });



        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CadastroViewModel.class);
        // TODO: Use the ViewModel
    }

}