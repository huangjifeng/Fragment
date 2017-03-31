package com.huangjifeng.fragment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.huangjifeng.fragment.R;

/**
 * Created by Administrator on 2017/3/31.
 */

public class TitleFragment extends Fragment {
    private ImageView title_image;
    //注意：除了onCreateView，其他的所有方法如果你重写了，必须调用父类对于该方法的实现，


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //当Fragment与Activity发生关联时调用。
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //创建该Fragment的视图，返回的就是fragment要显示的view，这个方法里面最好只做和UI相关的操作

        View view = inflater.inflate(R.layout.fragment_main_title, container, false);
        title_image = (ImageView) view.findViewById(R.id.title_image);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //在onCreateView执行完后立即执行。

        initListener();
    }

    private void initListener() {
        title_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "我是标题栏的一个图片", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //当Activity的onCreate方法返回时调用
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //与onCreateView想对应，当该Fragment的视图被移除时调用
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        //与onAttach相对应，当Fragment与Activity关联被取消时调用
    }
}
