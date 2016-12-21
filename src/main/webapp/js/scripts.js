"use strict";

let currentCategory = 'popular';

$( document ).ready( main );

function main()
{
    $( '.category' ).on( 'click', changeCategory );
}

function changeCategory()
{
    $( '.payments.' + currentCategory ).css( 'display', 'none' );
    $( '.payments.' + this.dataset.categoryName ).css( 'display', 'flex' );
    currentCategory = this.dataset.categoryName;
    $( '.payment-category-label' ).text( this.dataset.categoryTitle );
}