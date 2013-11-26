package com.arisprungsuperproject.facebook;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.arisprungsuperproject.R;
import com.facebook.Session;

public class FacebookFriendFragment extends Fragment
{


	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		
		View view = inflater.inflate(R.layout.facebook_login_activity, container, false);
	
		return view;
	}
	
	

}
