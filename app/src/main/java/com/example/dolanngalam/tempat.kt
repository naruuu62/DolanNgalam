package com.example.dolanngalam

import android.os.Parcelable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.dolanngalam.model.tempatPerjalanan
import com.example.dolanngalam.presentation.ui.theme.poppinsFont
import kotlinx.android.parcel.Parcelize

// Data class sesuai dengan struktur di Firestore

@Parcelize
data class Tempat(
    var id: String = "",
    val namaLokasi: String = "",
    val address: String = "",
    val category: String = "",
    var close: String = "",
    val deskripsi: String = "",
    var open: String = "",
    val phoneNumber: String = "",
    val priceRange: Long = 0,
    val tags: List<String> = emptyList(),
    val gambar: String = "",
    val daftarPerjalanan: List<tempatPerjalanan> = emptyList()

) : Parcelable
