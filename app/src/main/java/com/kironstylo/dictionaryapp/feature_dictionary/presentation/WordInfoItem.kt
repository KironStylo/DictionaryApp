package com.kironstylo.dictionaryapp.feature_dictionary.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kironstylo.dictionaryapp.feature_dictionary.domain.model.WordInfo

@Composable
fun WordInfoItem(
    wordInfo: WordInfo,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier){
        Text(
            text = wordInfo.word,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = wordInfo.phonetic,
            fontWeight = FontWeight.Light
        )
        Spacer(modifier = Modifier.height(16.dp))

        wordInfo.meanings?.forEach{ meaning ->
            val stringBuilder = StringBuilder()
            Text(text = meaning.partOfSpeech, fontWeight = FontWeight.Bold)
            meaning.definitions?.forEachIndexed{ index, definition ->
                Text(text = "${index + 1} ${definition.definition}")
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Example: ${definition.example}")
                Spacer(modifier = Modifier.height(8.dp))
            }
            Text("Synonyms", fontSize = 16.sp)
            meaning.synonyms?.forEach {
                stringBuilder.append(it).append(" ")
            }
            Text(stringBuilder.toString(), fontSize = 12.sp)
            Spacer(modifier = Modifier.height(8.dp))
            stringBuilder.clear()
            Text("Antonyms", fontSize = 16.sp)
            meaning.antonyms?.forEach {
                stringBuilder.append(it).append(" ")
            }
            Text(stringBuilder.toString(), fontSize = 12.sp)

        }
        Spacer(modifier = Modifier.height(8.dp))
    }
}