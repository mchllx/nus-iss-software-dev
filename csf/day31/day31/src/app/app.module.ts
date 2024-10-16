import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PictureComponent } from './components/picture.component';
import { HistoryComponent } from './components/history.component';
import { DealsComponent } from './components/deals.component';

@NgModule({
  declarations: [
    AppComponent, PictureComponent, HistoryComponent, DealsComponent
  ],
  imports: [
    BrowserModule,],

  exports: [ PictureComponent],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
