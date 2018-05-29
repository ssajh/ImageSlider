package ir.systemco.ssaj.circleindicator;

// This Class set the content of pager.
// include: number of pages,color or picture of page and etc

import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SamplePagerAdapter extends PagerAdapter {

   // private final Random random = new Random();
    private int mSize;

    public SamplePagerAdapter() {           // Constructor when slider No. not determined
        mSize = 3;                          // Constant Number of Sliders
    }

    public SamplePagerAdapter(int count)
    {
        mSize = count;
    }

    @Override public int getCount()
    {
        return mSize;
    }

    @Override public boolean isViewFromObject(View view, Object object) {

        return view == object;
    }

    @Override public void destroyItem(ViewGroup view, int position, Object object) {
        view.removeView((View) object);
    }

    @Override public Object instantiateItem(ViewGroup view, int position) {

        // .......... A .............

        ImageView imageView1 = new ImageView(view.getContext());
        imageView1.setImageResource(R.drawable.wtc);

        ImageView imageView2 = new ImageView(view.getContext());
        imageView2.setImageResource(R.drawable.shahrdari);

        ImageView imageView3 = new ImageView(view.getContext());
        imageView3.setImageResource(R.drawable.elgoli);

        ImageView imageView4 = new ImageView(view.getContext());
        imageView4.setImageResource(R.drawable.wtc);

        ImageView imageView5 = new ImageView(view.getContext());
        imageView5.setImageResource(R.drawable.shahrdari);

        ImageView imageEnd = new ImageView(view.getContext());
        imageEnd.setImageResource(R.drawable.black_radius_square);

        if (position == 0) {
            view.addView(imageView1, ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);
            return imageView1;
        } else if (position == 1) {
            view.addView(imageView2, ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);
            return imageView2;
        } else if (position == 2) {
            view.addView(imageView3, ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);
            return imageView3;
        }else if (position == 3) {
            view.addView(imageView4, ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);
            return imageView4;
        }else if (position == 4) {
            view.addView(imageView5, ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);
            return imageView5;
        }
        else
            return imageEnd;

        // .......... B .............

        // If you want just slide solid color with slide number
        // comment from A to B above and unComment behind code block

/*      TextView textView = new TextView(view.getContext());
        textView.setText(String.valueOf(position + 1));
        textView.setBackgroundColor(0xff000000 | random.nextInt(0x00ffffff));
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(48);
        return textView;      */

    }

    public void addItem() {
        mSize++;
        notifyDataSetChanged();
    }

    public void removeItem() {
        mSize--;
        mSize = mSize < 0 ? 0 : mSize;

        notifyDataSetChanged();
    }
}