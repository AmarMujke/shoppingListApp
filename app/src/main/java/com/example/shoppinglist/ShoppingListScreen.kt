import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.shoppinglist.R

@Composable
fun ShoppingListScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.shopping_list_title),
            style = MaterialTheme.typography.h4
        )
        Spacer(modifier = Modifier.height(16.dp))
        // Here you can add your list of items that the user needs to buy
        Text(
            text = "Milk",
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "Eggs",
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "Bread",
            style = MaterialTheme.typography.body1
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = { navController.navigate(R.id.welcome) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Back to Welcome Screen")
        }
    }
}
