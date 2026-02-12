package com.example.exameninterfaces

import android.content.ClipData
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exameninterfaces.ui.theme.ExamenInterfacesTheme
import kotlin.coroutines.CoroutineContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenInterfacesTheme {
                GreetingPreview()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    var counter by rememberSaveable { mutableStateOf(value = 0) }
    Column(
        modifier = Modifier
            .padding(top = 50.dp)
    ) {
        Text(text = "Andrés")
        Text(text = "Blanco Pardos")
    }
    Row(
        modifier = Modifier
            .padding(top = 100.dp)
    ) {
        Image(
            modifier = Modifier
                .height(50.dp)
                .clickable { counter++ },
            painter = painterResource(id = R.drawable.outline_adb_24),
            contentDescription = "Android"
        )
        Text(text = counter.toString())
    }

    LazyColumn(
        modifier = Modifier
            .padding(top = 200.dp)
    ) {
        item {
            Image(
                modifier = Modifier
                    .height(50.dp),
                painter = painterResource(id = R.drawable.outline_adb_24),
                contentDescription = "logo"
            )
            Text(text = "Esto es el simbolo de android")
        }
        item {
            Image(
                modifier = Modifier
                    .height(50.dp),
                painter = painterResource(id = R.drawable.outline_adb_24),
                contentDescription = "logo"
            )
            Text(text = "Esto es el simbolo de android")
        }
        item {
            Image(
                modifier = Modifier
                    .height(50.dp),
                painter = painterResource(id = R.drawable.outline_adb_24),
                contentDescription = "logo"
            )
            Text(text = "Esto es el simbolo de android")
        }
        item {
            Image(
                modifier = Modifier
                    .height(50.dp),
                painter = painterResource(id = R.drawable.outline_adb_24),
                contentDescription = "logo"
            )
            Text(text = "Esto es el simbolo de android")
        }
        item {
            Image(
                modifier = Modifier
                    .height(50.dp),
                painter = painterResource(id = R.drawable.outline_adb_24),
                contentDescription = "logo"
            )
            Text(text = "Esto es el simbolo de android")
        }
        item {
            Image(
                modifier = Modifier
                    .height(50.dp),
                painter = painterResource(id = R.drawable.outline_adb_24),
                contentDescription = "logo"
            )
            Text(text = "Esto es el simbolo de android")
        }
        item {
            LazyRow(
                modifier = Modifier
            ) {
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }
                item {
                    Image(
                        modifier = Modifier
                            .height(50.dp),
                        painter = painterResource(id = R.drawable.outline_adb_24),
                        contentDescription = "logo"
                    )

                }

            }
        }

    }
}