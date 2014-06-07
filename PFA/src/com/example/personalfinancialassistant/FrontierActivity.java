package com.example.personalfinancialassistant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class FrontierActivity extends Activity{
	ListView l1, l2;
	private List<Map<String, String>> d1 = new ArrayList<Map<String, String>>(); 
	private List<Map<String, String>> d2 = new ArrayList<Map<String, String>>(); 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.financial_frontier_layout);
		l1 = (ListView)findViewById(R.id.listView1);
		l2 = (ListView)findViewById(R.id.listView2);
		setData();
		SimpleAdapter a1 = new SimpleAdapter(this,
				d1, R.layout.listview_textview_item,
				new String[]{"title", "body"},
				new int[] {R.id.textView_item_title, R.id.textView_item_body});
		l1.setAdapter(a1);
		SimpleAdapter a2 = new SimpleAdapter(this,
				d2, R.layout.listview_textview_item2,
				new String[] {"msg"},
				new int[] {R.id.textView_item});
		l2.setAdapter(a2);
	}
	private void setData(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("title", "中国大妈投资最爱黄金：首饰是首选 次之为金币");
		map.put("body", "沉寂已久的内地珠宝市场出现回暖征兆。“五一”假期到来，珠宝消费正当时。对比往年，2014年初夏，沉寂已久的内地珠宝市场出现了比较明显的回暖征兆，其中的翡翠交易量大幅度回升，蓝宝石、海蓝宝石、碧玺等新兴珠宝依然旺销。多数业内人士认为，“五一”前后应是买入高档珠宝的较好时机；同期国际黄金(1283.30, -0.10, -0.01%)价格依然在“熊市”中徘徊，价位较低，也可买入黄金、铂金首饰，长线持有为佳。");
		d1.add(map);
		
		map = new HashMap<String, String>();
		map.put("title", "290多万理财款去哪儿了？ 海南市民告银行");
		map.put("body", "银行主管购买200多万元理财产品，到期却被告知理财委托系伪造，银行拒付，海南市民文先生不得已将银行告上法庭。业内人士指出，近年来，受限于专业知识，很多投资者对银行理财产品及其风险认识并不够，要避免上当受骗还需“熟读兵法”。");
		d1.add(map);
		
		map = new HashMap<String, String>();
		map.put("title", "央行：明年金融IC卡将不能使用磁条交易");
		map.put("body", "10月底前全国POS终端关闭金融IC卡降级交易，各商业银行应根据自身实际于年底前关闭在其他线下渠道终端上的金融IC卡降级交易。记者１５日从中国人民银行获悉，央行下发《关于逐步关闭ＩＣ卡有关事项的通知》，决定在全国范围内统一部署逐步关闭金融ＩＣ卡降级交易工作，以全面提升银行卡安全交易水平。");
		d1.add(map);
		
		map = new HashMap<String, String>();
		map.put("title", "银行存款遭互联网冲击:前四个月仅2月份没被搬家");
		map.put("body", "1月份、3月份、4月份人民币存款同比分别少增2.05万亿元、少增5576亿元、多减5545亿元。自去年开始，——各种“宝宝”从银行截走大量存款，央行发布的多个统计数据显示，，尤其是个人存款在大量流失。日前，央行发布的最新数据显示，4月份人民币存款减少6546亿元。有分析认为，超过万亿元的住户存款遭到分流，预示互联网金融大环境下，金融机构存款进一步流失。");
		d1.add(map);
		
		map = new HashMap<String, String>();
		map.put("msg", "陆金所 - 稳盈-安e贷");
		d2.add(map);
		
		map = new HashMap<String, String>();
		map.put("msg", "积木盒子 - 企业经营贷 第二期");
		d2.add(map);
		
		map = new HashMap<String, String>();
		map.put("msg", "陆金所 - 稳盈-安业贷");
		d2.add(map);
		
		map = new HashMap<String, String>();
		map.put("msg", "积木盒子 - 购房周转贷");
		d2.add(map);
		
		map = new HashMap<String, String>();
		map.put("msg", "广发基金 - 广发天天红发起式");
		d2.add(map);
		
		map = new HashMap<String, String>();
		map.put("msg", "金诚财富 - 无锡灵山希尔顿酒");
		d2.add(map);
		
		map = new HashMap<String, String>();
		map.put("msg", "金海贷 - 优企贷季季盈系列");
		d2.add(map);
		
		map = new HashMap<String, String>();
		map.put("msg", "长城信托 - 西安汇成和苑");
		d2.add(map);
	}
}
