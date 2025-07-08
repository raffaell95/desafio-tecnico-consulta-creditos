import { NgModule } from "@angular/core";
import { HomeComponent } from "./home.component";
import { CommonModule } from "@angular/common";
import { RouterModule } from "@angular/router";
import { HomeRoutingModule } from "./home.routing.module";



@NgModule({
    declarations: [HomeComponent],
    imports: [
        CommonModule,
        RouterModule,
        HomeRoutingModule
    ]
})
export class HomeModule{}