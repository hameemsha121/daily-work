import { Time } from '@angular/common';

export class StockPrice{

    id:number;
    companyCode:number;
    stockExchange:String;
    currentPrice:number;
    date:Date;
    time:Time;

}