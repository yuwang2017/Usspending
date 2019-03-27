import { Routes } from '@angular/router';

import {
    feature1Route
} from './';

const FEATURES_ROUTES = [
    feature1Route
];

export const featuresState: Routes = [{
    path: '',
    children: FEATURES_ROUTES
}];
