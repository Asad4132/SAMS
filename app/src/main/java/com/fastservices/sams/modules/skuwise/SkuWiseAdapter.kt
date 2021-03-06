package com.fastservices.sams.modules.skuwise

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.DecimalFormattedAmount
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.data.models.SKUWiseSummaryModel


class SkuWiseAdapter(val data: List<SKUWiseSummaryModel>) : RecyclerView.Adapter<SkuVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): SkuVH {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_sku_wise_summary, parent, false)

        return SkuVH(itemView)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: SkuVH, position: Int) {
        holder.bind(data[position])
    }
}

class SkuVH(val view: View) : RecyclerView.ViewHolder(view) {
    val tvItemName = view.findViewById<TextView>(R.id.tvSkuName)
    val tvQuantity = view.findViewById<TextView>(R.id.tvSKUQty)
    val tvNetAmount = view.findViewById<TextView>(R.id.tvSKUAmount)

    fun bind(item: SKUWiseSummaryModel) {

        tvItemName.text = item.SKU_NAME
        tvQuantity.text = item.QUANTITY_UNIT.toString()
        tvNetAmount.text = DecimalFormattedAmount(RoundUp2Decimal(item.NET_AMOUNT).toDouble())

    }
}
