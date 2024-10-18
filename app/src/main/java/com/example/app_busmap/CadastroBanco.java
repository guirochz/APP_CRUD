package com.example.app_busmap;

import android.content.Context;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class CadastroBanco {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static int inserirCadastro(Usuario usuario, Context ctx){
        int resposta = 0;

        try{
            PreparedStatement pst = ConexaoBanco.conectar(ctx).prepareStatement(
                    "Insert Into Usuario (nome, email, senha, statusUsuario, dataCadastro, nivelAcesso)"+
                            "values (?,?,?,?,?,?)"
            );
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getSenha());
            pst.setInt(4, 1);
            pst.setDate(5, Date.valueOf(LocalDate.now().toString()));
            pst.setString(6, "USER");

            resposta = pst.executeUpdate();

        }catch (Exception e){
            e.getMessage();
        }
        return resposta;
    }
}
