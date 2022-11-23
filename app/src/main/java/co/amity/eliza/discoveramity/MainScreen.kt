package co.amity.eliza.discoveramity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import co.amity.eliza.discoveramity.ui.theme.DiscoverAmityTheme

@Composable
fun MainScreen(
    onCommunitiesClicked: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CreateButton(title = "Communities", onButtonClick = onCommunitiesClicked)
    }
}

@Composable
fun CreateButton(title: String, onButtonClick: () -> Unit) {
    Button(onClick = onButtonClick, modifier = Modifier.wrapContentSize()) {
        Text(text = title)
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    DiscoverAmityTheme {
        MainScreen {}
    }
}