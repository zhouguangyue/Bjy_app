package app.wms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import app.wms.adapter.GridLayoutAdapter;

public class PdaIndex extends AppCompatActivity {

    private GridView gl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pda_index);
        //初始化
        initView();


    }

    private void initView() {
        gl = (GridView) findViewById(R.id.gl);
        List list = new ArrayList<>();
        list.add("采购上架");
        list.add("调拨上架");
        list.add("返架上架");
        list.add("消退上架");
        list.add("拣货上架");
        list.add("出库确认");
        list.add("补货作业");
        list.add("销退验收");
        list.add("同区移库");
        list.add("跨区移库");
        list.add("盘点作业");
        list.add("库存查询");

        GridLayoutAdapter adapter = new GridLayoutAdapter(list, getApplicationContext());
        gl.setAdapter(adapter);

        gl.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PdaIndex.this,Order.class);
                Bundle bundle = new Bundle();
                bundle.putInt("index",position);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}