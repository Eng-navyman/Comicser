package com.sedsoftware.comicser.features.navigation;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;

public class NavigationActivityPresenter extends MvpBasePresenter<NavigationActivityView> {

  @Override
  public void attachView(NavigationActivityView view) {
    super.attachView(view);
    getView().showTodayIssuesFragment();
  }
}
