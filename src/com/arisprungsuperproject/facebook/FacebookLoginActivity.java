package com.arisprungsuperproject.facebook;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.arisprungsuperproject.R;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Base64;
import android.util.Log;

public class FacebookLoginActivity extends FragmentActivity
{
	private FacbookLoginFragment faceloginFragment;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

//		try
//		{
//			PackageInfo info = getPackageManager().getPackageInfo("com.arisprungsuperproject", PackageManager.GET_SIGNATURES);
//			for (Signature signature : info.signatures)
//			{
//				MessageDigest md = MessageDigest.getInstance("SHA");
//				md.update(signature.toByteArray());
//				Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
//			}
//		}
//		catch (NameNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//		catch (NoSuchAlgorithmException e)
//		{
//			e.printStackTrace();
//		}

		if (savedInstanceState == null)
		{
			// Add the fragment on initial activity setup
			faceloginFragment = new FacbookLoginFragment();
			getSupportFragmentManager().beginTransaction().add(android.R.id.content, faceloginFragment).commit();
		}
		else
		{
			// Or set the fragment from restored state info
			faceloginFragment = (FacbookLoginFragment) getSupportFragmentManager().findFragmentById(android.R.id.content);
		}
	}
}
