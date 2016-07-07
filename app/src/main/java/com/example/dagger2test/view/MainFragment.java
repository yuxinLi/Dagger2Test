package com.example.dagger2test.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dagger2test.MainActivity;
import com.example.dagger2test.Product;
import com.example.dagger2test.R;
import com.example.dagger2test.ToastUtil;
import com.example.dagger2test.di.components.MainFragmentComponent;
import com.example.dagger2test.di.scopes.ProductLevel;
import com.example.dagger2test.presenter.MainPresenter;

import javax.inject.Inject;

public class MainFragment extends BaseFragment implements MainPresenter.IUserView{

    private OnFragmentInteractionListener mListener;
    @Inject
    MainPresenter mainPresenter;

    @Inject
    ToastUtil toastUtil;

    @ProductLevel("good")
    @Inject
    Product good;

    @Inject
    @ProductLevel("bad")
    Product bad;

    MainFragmentComponent mainFragmentComponent;

    public MainFragment() {
    }

    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (getActivity() instanceof MainActivity){
            mainFragmentComponent = ((MainActivity)getActivity()).getmMainComponent().mainFragmentComponent();
            mainFragmentComponent.inject(this);

            mainPresenter.setUserView(this);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_main, container, false);
        v.findViewById(R.id.get_user).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.getUser();
            }
        });
        v.findViewById(R.id.show_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastUtil.showToast("dfdafda");
            }
        });
        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void setUserName(String name) {
        ((TextView)getView().findViewById(R.id.user_info)).setText(name+ " bad = "+bad.s + " , good = "+ good.s);
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
