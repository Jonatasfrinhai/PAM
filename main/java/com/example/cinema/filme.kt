package com.example.cinema

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.cinema.ui.theme.CinemaTheme

class filme : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CinemaTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    filme2()
                }
            }
        }
    }
}

@Composable
fun filme2(){
    var texto1 by remember { mutableStateOf("") }
    var texto2 by remember { mutableStateOf("") }
    var texto3 by remember { mutableStateOf("") }
    var texto4 by remember { mutableStateOf("") }
    var texto5 by remember { mutableStateOf("") }

    val filme = painterResource(R.drawable.a)
    val filme2 = painterResource(R.drawable.b)
    val filme3 = painterResource(R.drawable.c)

    Column(

        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize(),


        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier
                .background(Color.Black)
                .fillMaxWidth(),
            Arrangement.Absolute.Center

        ) {

            Text(
                text = "CineMenos+",
                color = Color.Red,
                fontSize = 30.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )


        }
        Spacer(modifier = Modifier.height(16.dp))
        // Campos de texto
        Column(
            modifier = Modifier.fillMaxWidth(),

            ) {

            Row(
                Modifier
            ) {
                Column() {


                    Image(
                        painter = filme2,
                        contentDescription = null,
                        modifier = Modifier
                            .size(230.dp)

                            .padding(0.dp),
                    )
                }
                Column() {
                    Text(
                        text = "The Lords of the Rings",
                        color = Color.White,
                        fontSize = 25.sp,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = "Após a captura de Merry e Pippy pelos orcs, a Sociedade do Anel é dissolvida. Frodo e Sam seguem sua jornada rumo à Montanha da Perdição para destruir o anel e descobrem que estão sendo perseguidos pelo misterioso Gollum. Enquanto isso, Aragorn, o elfo e arqueiro Legolas e o anão Gimli partem para resgatar os hobbits sequestrados e chegam ao reino de Rohan, onde o rei Theoden foi vítima de uma maldição mortal de Saruman.",
                        color = Color.White,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                }
            }

        }
        Spacer(modifier = Modifier.height(16.dp))



        Button(
            onClick = {},
            modifier = Modifier
                .height(35.dp)
        ) {
            Text(text = "COMPRAR INGRESSOS", color = Color.White)

        }
    }
}


@Composable
@Preview(showBackground = true)
fun filme2Preview(){
    CinemaTheme {

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            filme2()
        }
    }
}
