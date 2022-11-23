package co.amity.eliza.discoveramity

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Contract for information needed on every Rally navigation destination
 */
interface Destination {
    val route: String
    val icon: ImageVector?
}

object Main : Destination {
    override val route: String = "main"
    override val icon: ImageVector? = null
}

object Communities : Destination {
    override val route: String = "communities"
    override val icon: ImageVector? = null
}