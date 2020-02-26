import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StockPrice } from '../models/stockprice';

@Injectable({
  providedIn: 'root'
})
export class StockPriceService {

  httpUrl = 'http://localhost:8002/stockPrice/';
  constructor(private httpclient: HttpClient, private stockPriceService: StockPriceService) { }
  getAllStockPrice(): Observable<StockPrice[]> {
    return this.httpclient.get<StockPrice[]>(this.httpUrl);
  }
  saveStockPrice(stockPrice: StockPrice): Observable<StockPrice> {
    return this.httpclient.post<StockPrice>(this.httpUrl, stockPrice);
  }
  deleteStockPrice(id: number): Observable<StockPrice> {
    return this.httpclient.delete<StockPrice>(this.httpUrl + id);
  }
  updateStockPriceInfo(stockPrice: StockPrice): Observable<StockPrice> {
    return this.httpclient.put<StockPrice>(this.httpUrl, stockPrice);
  }
  getStockPriceById(id: number): Observable<StockPrice> {
    return this.httpclient.get<StockPrice>(this.httpUrl + id);
  }
}
