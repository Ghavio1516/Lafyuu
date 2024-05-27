package com.ghavio.lafyuu

import com.ghavio.lafyuu.R

object DataProvider {
    fun getProductById(productId : Int): DataProduct? {
        return productList.find {it.id == productId}
    }

    fun getRelatedProducts(productId: Int): List<DataProduct> {
        // Implementasi untuk mendapatkan produk terkait
        // Misalnya, mengembalikan produk dengan kategori yang sama
        val product = getProductById(productId)
        return productList.filter { it.id == product?.id && it.id != productId }
    }

    var productList = listOf(
        DataProduct(
            1,
            "Nahiki Water Udin",
            "Rp 400.000",
            "Rp 800.000",
            "50% off",
            "\"The Nike Air Max 270 React ENG combines a\\n\" +\n" +
                    "                    \"full-length React foam midsole with a 270 Max Air\\n\" +\n" +
                    "                    \"unit for unrivaled comfort and a striking visual\\n\" +\n" +
                    "                    \"experience.\"",
            R.drawable.nahiki
        ),
        DataProduct(
            2,
            "Nahiki Water Bendi",
            "Rp 200.000",
            "Rp 400.000",
            "50% off",
            "\"The Nike Air Max 270 React ENG combines a\\n\" +\n" +
                    "                    \"full-length React foam midsole with a 270 Max Air\\n\" +\n" +
                    "                    \"unit for unrivaled comfort and a striking visual\\n\" +\n" +
                    "                    \"experience.\"",
            R.drawable.nahiki
        ),
        DataProduct(
            3,
            "Nahiki Fire Udin",
            "Rp 200.000",
            "Rp 400.000",
            "50% off",
            "\"The Nike Air Max 270 React ENG combines a\\n\" +\n" +
                    "                    \"full-length React foam midsole with a 270 Max Air\\n\" +\n" +
                    "                    \"unit for unrivaled comfort and a striking visual\\n\" +\n" +
                    "                    \"experience.\"",
            R.drawable.nahiki
        ),
        DataProduct(
            4,
            "Nahiki Fire Bendi",
            "Rp 200.000",
            "Rp 400.000",
            "50% off",
            "\"The Nike Air Max 270 React ENG combines a\\n\" +\n" +
                    "                    \"full-length React foam midsole with a 270 Max Air\\n\" +\n" +
                    "                    \"unit for unrivaled comfort and a striking visual\\n\" +\n" +
                    "                    \"experience.\"",
            R.drawable.nahiki
        ),
    )
}