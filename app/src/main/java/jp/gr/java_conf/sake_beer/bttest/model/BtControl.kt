package jp.gr.java_conf.sake_beer.bttest.model

import android.content.Context
import android.bluetooth.BluetoothManager
import android.bluetooth.BluetoothAdapter
import android.widget.Toast

class BtControl() {

    var manager: BluetoothManager? = null
    var adapter: BluetoothAdapter? = null
    var enabled: Boolean = false
    var deviceName: String = "-"

    fun initModel(context:Context): Boolean {
        enabled = false
        manager = context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        if (manager == null) {
            Toast.makeText(context, "[Error] Bluetooth is not supported!", Toast.LENGTH_LONG).show()
            return false
        }
        adapter = manager?.adapter
        if (adapter == null) {
            Toast.makeText(context, "[Error] cannot find BT adapter!", Toast.LENGTH_LONG).show()
            return false
        }
        if (adapter?.isEnabled == false) {
            Toast.makeText(context, "[Error] BT is not enabled!", Toast.LENGTH_LONG).show()
            return false
        }
        enabled = true
//        Toast.makeText(context, "Bluetooth enabled", Toast.LENGTH_SHORT).show()
//        Toast.makeText(context, "manager=" + manager.toString(), Toast.LENGTH_SHORT).show()
//        Toast.makeText(context,"adapter="+ adapter.toString(), Toast.LENGTH_SHORT).show()
        return true;
    }



}