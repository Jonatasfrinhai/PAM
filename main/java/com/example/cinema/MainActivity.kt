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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CinemaTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun CampoTextoGenero(

    valor: String,
    onValueChange: (String) -> Unit,
    label: String
) {

        Column {

        }
            Row {
                val icone1 = painterResource(R.drawable.icone)
                Image(
                    painter = icone1,
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                        .padding(0.dp),
                )

                TextField(
                    value = valor,
                    onValueChange = onValueChange,
                    placeholder = { Text(label, color = Color.DarkGray) },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                )
            }
}


@Composable
fun App() {
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
        Row (
            Modifier
                .background(Color.Black)
                .fillMaxWidth(),
                    Arrangement.Absolute.Center

        ){

        Text(
            text = "CineMenos+",
            color = Color.Red,
            fontSize = 30.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )


            }
        // Campos de texto
        Column(
            modifier = Modifier.fillMaxWidth(),

            ) {
            CampoTextoGenero(texto1, { texto1 = it }, "<                         Fantasia                     >")
            Row (
                Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom


            ){
                Image(
                    painter = filme,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(0.dp),
                )

                Image(
                    painter = filme2,
                    contentDescription = null,
                    modifier = Modifier
                        .size(130.dp)
                        .padding(0.dp),
                )
                Image(
                    painter = filme3,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(0.dp),
                )
            }

        }
        Spacer(modifier = Modifier.height(16.dp))



        Button(
            onClick = {},
            modifier = Modifier
                .height(35.dp)
        ) {
            Text(text = "ingressos", color = Color.White)

        }
        Column(
            modifier = Modifier.fillMaxWidth(),

            ) {
            CampoTextoGenero(texto2, { texto2 = it }, "Ação")
            Row (
                Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom


            ){
              }

        }
        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),

            ) {
            CampoTextoGenero(texto3, { texto3 = it }, "Comédia")
            Row (
                Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom


            ){

            }

        }
        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),

            ) {
            CampoTextoGenero(texto4, { texto4 = it }, "Romance")
            Row (
                Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom


            ){

            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),

            ) {
            CampoTextoGenero(texto2, { texto2 = it }, "Ficção científica")
            Row (
                Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom


            ){
            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),

            ) {
            CampoTextoGenero(texto2, { texto2 = it }, "Suspense")
            Row (
                Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom


            ){
            }

        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}






@Composable
@Preview
fun AppPreview(){
    CinemaTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}